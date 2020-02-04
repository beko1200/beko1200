const table = document.getElementById("empview");

window.onload = () => {
    let xhr = new XMLHttpRequest ();
    xhr.open('get' , "/com.projectone/viewMyReimbursement.json" , true);
    xhr.send();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let reimbursements = JSON.parse(xhr.responseText);
            console.log(reimbursements);
            for (let i = 0; i < reimbursements.length; i++){
                addToTable(reimbursements[i]["id"],  reimbursements[i]["amount"],
                        reimbursements[i]["submitted"],  reimbursements[i]["resolved"], 
                        reimbursements[i]["description"], reimbursements[i]["author"],
                        reimbursements[i]["resolver"],reimbursements[i]["status"], 
                        reimbursements[i]["type"]);
            }
            }
    }
}

function addToTable(id, amount, submitted, resolved, description, author, resolver, 
    status, type) {

const tr = document.createElement("tr");
const ID = document.createElement("td");
ID.innerHTML=id;
tr.append(ID);

const amo = document.createElement("td");
amo.innerHTML=amount;
tr.append(amo);

const sub = document.createElement("td");
sub.innerHTML=submitted;
tr.append(sub);

const resol = document.createElement("td");
resol.innerHTML=resolved||'';
tr.append(resol);

const desc = document.createElement("td");
desc.innerHTML=description;
tr.append(desc);

const auth = document.createElement("td");
auth.innerHTML=author;
tr.append(auth);

const res = document.createElement("td");
res.innerHTML=resolver||'';
tr.append(res);

const stat = document.createElement("td");
stat.innerHTML=status;
tr.append(stat);

const typo = document.createElement("td");
typo.innerHTML=type;
tr.append(typo);

table.append(tr);
}
























































// {/* <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> */}

// function getReimbursement(){
//     const ReimbursementId = document.getElementById('reimbursementid').value;

//     /* 
//         step 1
//             the following object allows us to make requests over
//                 http and get data back. This is our data retriever.
//     */
//    const xhr = new XMLHttpRequest();

//    //step 2, add an event listener
//    xhr.onreadystatechange = function (){
//         // console.log('the ready state has changed');

//         if(xhr.readyState===4 && xhr.status===200){
//             // console.log('we are ready');

//             /* 
//              what is the ready state?
//                  the state of the request
//             status code
//                 http status code, the condition of the response
            
//             status codes:
//                 100 = informational
//                 200 = ok
//                 300 = redirect
//                 400 = client side error
//                 500 = server side error
            
//             ready state:
//                 0 = request has not been initialized
//                 1 = server connection has been established
//                 2 = request received
//                 3 = processing request
//                 4 = request has finished and the response is ready
//                 */
//                 const pk = JSON.parse(xhr.responseText);
//                 // console.log(pk);
//                 implant(pk);
//             }


//    }

//    /* 
//     step 3
//         create a connection
//             open(httpMethod, url)
//             open(httpMethod, url, async (true by default))
//    */
//   xhr.open('GET', 'http://localhost/'+pkId);

//   /* 
//    step 4
//     send the request to retrieve information
//   */
//  xhr.send();
// }

// document.getElementById('pksubmit').addEventListener('click',getpkBetter);


// function implant(json){
//     document.getElementById('pkinfo').innerHTML=json.name;
// }

// let reimbursements = [];
// function getpk2(){
//     const pkId = document.getElementById('pkid').value;
//     const xhr = new XMLHttpRequest();
//     xhr.onreadystatechange=function (){
//         if(xhr.readyState===4&&xhr.status===200){
//             reimbursements = (Json.parse(xhr.responseText));
            
//         }
//     }
//     xhr.open('GET', 'http://localhost:8080//com.projectone/viewMyReimbursement.json');
//     xhr.send();
// }


// function addToTable(table, horse) {
    
//     // const name = document.createElement('td');
//     // name.innerHTML=horse.name;
//     // tr.append(name);
    
//     // const age = document.createElement('td');
//     // age.innerHTML=horse.age;
//     // tr.append(age);
    
//     // const hair_color = document.createElement('td');
//     // hair_color.innerHTML=horse.hair_color;
//     // tr.append(hair_color);
    
//     // const breed = document.createElement('td');
//     // breed.innerHTML=horse.breed;
//     // tr.append(breed

// //fetch api
// function getpkBetter(){
//     const pkId = document.getElementById('pkid').value;
//     fetch('http://pokeapi.co/api/v2/pokemon/'+pkId)
//         .then(response=> response.json())
//         .then(json=>console.log(new Pk(json.name, json.base_experience)));
// }


