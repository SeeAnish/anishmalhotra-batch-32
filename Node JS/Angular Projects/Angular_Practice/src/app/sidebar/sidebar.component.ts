import { Router } from '@angular/router';
import { Component } from '@angular/core';
import { groupBy } from 'lodash';

interface rawdata 
{
  fullname: string;
  LeadName: string;
  technology: string;
  vendorName: string;
  rate: string;
  isEditing: boolean;
}

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})

export class SidebarComponent 
{
  selectedTechFilter:string = '';
  selectedLeadFilter:String = '';
  constructor(private router: Router) {}
  showSubmissionForm: boolean = false;
  tableData = [{
    fullname: "Anish Malhotra",
    LeadName:"Manohar",
    technology: 'Java Full Stack',
    vendorName: 'ABC Corp',
    rate: '$50/hour',
    isEditing: false
  },
  {
    fullname: "Vaishnav",
    LeadName:"Tejan",
    technology: 'Java Full Stack',
    vendorName: 'DEF Corp',
    rate: '$60/hour',
    isEditing: false
  }];

  deleterow(i:number) {
    this.tableData.splice(i,1);
  }

  toggleEdit(index: number) {
    this.tableData[index].isEditing = !this.tableData[index].isEditing;
  }

  saverow(index: number) {
    this.tableData[index].isEditing = false;
  }

  addrow() {
    this.tableData.push({
      fullname: "",
    LeadName:"",
    technology: '',
    vendorName: '',
    rate: '',
    isEditing: true
    });    
  }

  get uniquetech(): string[] {
    const data = groupBy(this.tableData, 'technology')
    return Object.keys(data);
  }

  
  get uniqueleads() : string[] {
    const data = groupBy(this.tableData, 'LeadName')
    return Object.keys(data);
  }
  
  filteredTableData: rawdata[] = [];
  
  applyfilter() {
    if(this.selectedLeadFilter) 
      this.filteredTableData = this.tableData.filter(data => data.LeadName === this.selectedLeadFilter)
    if(this.selectedTechFilter) 
      this.filteredTableData = this.tableData.filter(data => data.technology === this.selectedTechFilter)
    else
      this.filteredTableData = this.tableData
  }

}
