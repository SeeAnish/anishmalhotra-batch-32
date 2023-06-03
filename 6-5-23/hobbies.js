array = []
const print = () => {
    console.log(array)
}
const adding = (hobby, array) => {
    array.push(hobby)
}
const delet = (hobby, array) => {
    for(i = 0; i < array.length; i++)
    {
        if(hobby == array[i]) array.splice(i, 1)
    }
    console.log("No such hobby was present in the array")
}
adding("swimming", array)
adding("reading", array)
adding("driving", array)
delet("reading", array)
print()