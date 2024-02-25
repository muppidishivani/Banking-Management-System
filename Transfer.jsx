import { useRef,useState } from "react";
import axios from "axios";
const Transfer=()=>{
    const[res,setRes]=useState([]);
    const ref1=useRef(null);
    const ref2=useRef(null);
    const ref3=useRef(null);
    const ref4=useRef(null);
   
    
    const Post_data=()=>{
     PostEx();
    }
    const PostEx=async()=>
    {
        const res= await axios.post("http://localhost:9003/trasfer",{"accountno":ref1.current.value,
       "targetAccountno":ref2.current.value,"password":ref3.current.value,"amount":ref4.current.value});
        const {data}=res;
        setRes(data);
       
    }
   return(
    <>
     <center>
        <h1 style={{color: "red",background:"aqua"}}>BANKING MANAGEMENT SYSTEM</h1>
    <h2 style={{color: "green",background:"pink"}}>TRANSFER AMOUNT FORM</h2>
    
    <table border="1">
        
        <tr style={{color:"blue",background:"orange"}}>
    <th>Account No:</th>
    <td><input type="text" ref={ref1}></input><br></br></td></tr>
    <tr style={{color:"blue",background:"orange"}}>
   <th>Target Account No:</th> 
   <td><input type="text" ref={ref2}></input><br></br></td></tr>
   <tr style={{color:"blue",background:"orange"}}>
    <th>Password:</th> 
    <td><input type="text" ref={ref3}></input><br></br></td></tr>
    <tr style={{color:"blue",background:"orange"}}>
    <th>Amout:</th> 
    <td><input type="text" ref={ref4}></input><br></br></td></tr>
    <tr style={{color:"blue",background:"orange"}}>
    
     <button onClick={Post_data}>Post</button></tr>
     <p>{JSON.stringify(res)}</p>
     </table>
     </center>
    </>
   )
}
export default  Transfer;