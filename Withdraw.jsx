import { useRef,useState } from "react";
import axios from "axios";
const Withdraw=()=>{
    const[res,setRes]=useState([]);
    const ref1=useRef(null);
    const ref2=useRef(null);
    const ref3=useRef(null);
   
    
    const Post_data=()=>{
     PostEx();
    }
    const PostEx=async()=>
    {
        const res= await axios.post("http://localhost:9003/withdraw",{"accountno":ref1.current.value,
        "password":ref2.current.value,"withdrawAmount":ref3.current.value});
        const {data}=res;
        setRes(data);
       
    }
   return(
    <>
    <center>
    <h2 style={{color: "brown",background:"green"}}>WITHDRAW AMOUNT FORM</h2>
    
    <table border="1">
        
        <tr style={{color:"blue",background:"pink"}}>
    <th>Account No:</th>
    <td><input type="text" ref={ref1}></input><br></br></td></tr>
    <tr style={{color:"blue",background:"pink"}}>
   <th>Password:</th> 
   <td><input type="text" ref={ref2}></input><br></br></td></tr>
   <tr style={{color:"blue",background:"pink"}}>
    <th>Withdraw:</th> 
    <td><input type="text" ref={ref3}></input><br></br></td></tr>
    <tr style={{color:"blue",background:"pink"}}>
    
     <button onClick={Post_data}>Post</button></tr>
     <p>{JSON.stringify(res)}</p>
     </table>
     </center>
    </>
   )
}
export default  Withdraw;