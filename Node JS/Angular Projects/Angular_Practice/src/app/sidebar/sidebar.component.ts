import { Router } from '@angular/router';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { groupBy } from 'lodash';
import { AuthService } from '../services/auth.service';

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

export class SidebarComponent implements OnInit, OnDestroy
{
  selectedTechFilter:string = '';
  selectedLeadFilter:string = '';
  showSubmissionForm: boolean = false;
  filteredTableData: rawdata[] = [];
  showtable:boolean = false;

  constructor(private router: Router, private authService: AuthService) {
    window.onpopstate = () => {
      if(!this.authService.isAuthenticated)
        this.router.navigate(['/login']);
    }
  }

  ngOnInit() {
    this.applyfilter();
  }

  onButtonClick() {
    this.showtable = !this.showtable;
  }
  
  tableData: rawdata[] = [
    {
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
      rate: '$55/hour',
      isEditing: false
    },
    {
      fullname: "Sachin",
      LeadName:"Prem",
      technology: 'Dev Ops',
      vendorName: 'GHI Corp',
      rate: '$60/hour',
      isEditing: false
    },
    {
      fullname: "Ruchi",
      LeadName:"Anand",
      technology: 'DevOps',
      vendorName: 'JKL Corp',
      rate: '$65/hour',
      isEditing: false
    },
    {
      fullname: "Shiva",
      LeadName:"Manohar",
      technology: 'Data Engineer',
      vendorName: 'JKL Corp',
      rate: '$70/hour',
      isEditing: false
      },
      {
        fullname: "Dinesh",
        LeadName:"Tejan",
        technology: 'Data Engineer',
        vendorName: 'MNO Corp',
        rate: '$75/hour',
        isEditing: false
      },
      {
        fullname: "Vishnu",
        LeadName:"Prem",
        technology: 'SalesForce',
        vendorName: 'PQR Corp',
        rate: '$80/hour',
        isEditing: false
      },
      {
        fullname: "Vikas",
        LeadName:"Anand",
        technology: 'SalesForce',
        vendorName: 'STU Corp',
        rate: '$85/hour',
        isEditing: false
      }
  ];

  deleterow(i:number, data:rawdata) {
    //this.tableData.splice(i,1);
    const index = this.tableData.indexOf(data);
    if(index > -1) this.tableData.splice(index,1);
    this.applyfilter();
  }

  deleteItem(i:number, data:rawdata) {
    const confirmation = confirm("Are you sure you want to delete this item?");
    if(confirmation) this.deleterow(i, data);
  }

  toggleEdit(index: number) {
    //this.tableData[index].isEditing = !this.tableData[index].isEditing;
    const item = this.filteredTableData[index];
    const tableIndex = this.tableData.findIndex(data => data === item);
    if(tableIndex > -1) 
    {
      this.tableData[tableIndex] = {...this.tableData[tableIndex], isEditing: true};
      this.applyfilter();
    }
  }

  saverow(index: number) {
    const item = this.filteredTableData[index];
    const tableIndex = this.tableData.findIndex(data => data === item);
    if(tableIndex !== -1)
    { 
      this.tableData[tableIndex] = {...item, isEditing:false};
      this.applyfilter();
    //this.tableData = this.tableData.map(data => data === item ? {...item} : data); // updated line
      //console.log(this.tableData);
    }
    //this.filteredTableData[index].isEditing = false;
    // removed the applyfilter call
}

  addrow() {
    const newRow: rawdata = {
      fullname: "",
      LeadName:this.selectedLeadFilter ? this.selectedLeadFilter : "",
      technology: this.selectedTechFilter ? this.selectedTechFilter : '',
      vendorName: '',
      rate: '',
      isEditing: true
    };
    this.tableData.push(newRow);
    //this.filteredTableData.push(newRow);
    //window.alert("Row added successfully");
    this.applyfilter();
  }

  get uniquetech(): string[] {
    const data = groupBy(this.tableData, 'technology')
    return Object.keys(data);
  }

  
  get uniqueleads() : string[] {
    const data = groupBy(this.tableData, 'LeadName')
    return Object.keys(data);
  }
  
  applyfilter() {
    this.filteredTableData = 
    this.selectedLeadFilter || this.selectedTechFilter ?
    this.tableData.filter(data =>
      (!this.selectedTechFilter || data.technology === this.selectedTechFilter) &&
      (!this.selectedLeadFilter || data.LeadName === this.selectedLeadFilter)) 
      : [...this.tableData];
  }

  ngOnDestroy(): void {
    window.onpopstate = null;     
  }

}
