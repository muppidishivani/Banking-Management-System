import { useRef,useState } from "react";

import axios from "axios";
const App1=()=>{
    const[res,setRes]=useState([]);
    const ref1=useRef(null);
    const ref2=useRef(null);
    const ref3=useRef(null);
    const ref4=useRef(null);
    const ref5=useRef(null);
    const ref6=useRef(null);
    const ref7=useRef(null);
    
    const Post_data=()=>{
     PostEx();
    }
    const PostEx=async()=>
    {
        const res= await axios.post("http://localhost:9003/save",{"accountno":ref1.current.value,
        "name":ref2.current.value,"password":ref3.current.value,"amount":ref4.current.value,"address":ref5.current.value
        ,"mobileno":ref6.current.value,"status":ref7.current.value});
        const {data}=res;
        setRes(data);
       
    }
   return(
    <>
    <center>
    <h2 style={{color: "red",background:"pink"}}>INSERT Bank DATA HERE</h2>
    
    <table border="1">
        
        <tr style={{color:"green",background:"yellow"}}>
    <th>Account No:</th>
    <td><input type="text" ref={ref1}></input><br></br></td></tr>
    <tr style={{color:"green",background:"yellow"}}>
   <th>Name:</th> 
   <td><input type="text" ref={ref2}></input><br></br></td></tr>
   <tr style={{color:"green",background:"yellow"}}>
    <th>password:</th> 
    <td><input type="text" ref={ref3}></input><br></br></td></tr>
    <tr style={{color:"green",background:"yellow"}}>
     <th>Amount:</th>
     <td><input type="text" ref={ref4}></input><br></br></td></tr>
     <tr style={{color:"green",background:"yellow"}}>
     <th>Address:</th>
     <td><input type="text" ref={ref5}></input><br></br></td></tr>
     <tr style={{color:"green",background:"yellow"}}>
     <th>Mobile No:</th>
     <td><input type="text" ref={ref6}></input><br></br></td></tr>
     <tr style={{color:"green",background:"yellow"}}>
    <th> Status:</th>
    <td><input type="text" ref={ref7}></input><br></br></td></tr>
    <tr style={{color:"green",background:"yellow"}}>
     <button onClick={Post_data}>Post</button></tr>
    
     </table>
    
     </center>
     <p>{JSON.stringify(res)}</p>
     
    </>
   )
}
export default  App1;