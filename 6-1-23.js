let statement = 'stage'
let value = 10
let sendamount = 0
// if(statement === 'dev') 
// {
//     sendamount = value + 0.1*value;
//     console.log(sendamount)
// }
// else if(statement === 'test') 
// {
//     sendamount = value + 0.2*value;
//     console.log(sendamount)
// }
// else if(statement === 'stage') 
// {
//     sendamount = value + 0.3*value;
//     console.log(sendamount)
// }
// else if(statement === 'prod') 
// {
//     sendamount = value + 0.05*value;
//     console.log(sendamount)
// }
// else console.log("such value does not exist")

switch (statement) {
    case 'dev':
        sendamount = value + 0.1*value;
        console.log(sendamount)
        break;
    case 'test':
        sendamount = value + 0.2*value;
        console.log(sendamount)
        break;
    case 'stage':
        sendamount = value + 0.3*value;
        console.log(sendamount)
        break;
    case 'prod':
        sendamount = value + 0.05*value;
        console.log(sendamount)
        break;
    default:
        console.log("Incorrect input");
        break;
}