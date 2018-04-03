
  
<h3>Login Form</h3>  
<%  
String profile_msg=(String)request.getAttribute("profile_msg");  
if(profile_msg!=null){  
out.print(profile_msg);  
}  
String login_msg=(String)request.getAttribute("login_msg");  
if(login_msg!=null){  
out.print(login_msg);  
}  
 %>  
 <br/>  
<form action="loginprocess.jsp" method="post">  
Id	 	: <input type="text" name="id"/><input type="submit" value="search"/>"<br/><br/>  
Area 	: <input type="text" name="area"/><br/><br/>  
Street 	: <input type="text" name="street"/><br/><br/>  
City 	: <input type="text" name="city"/><br/><br/>  
State 	: <input type="text" name="state"/><br/><br/>  
Zip 	: <input type="text" name="zip"/><br/><br/>  
Branch 	: <input type="text" name="branch"/><br/><br/>  
Country : <input type="text" name="country"/><br/><br/>  
created : <input type="text" name="created"/><br/><br/>    
Created By : <input type="text" name="createdBy"/><br/><br/>  	
Modified : <input type="text" name="modified"/><br/><br/>  
Modified By : <input type="text" name="modifiedBy"/><br/><br/>  
created By Task Id : <input type="text" name="createdByTaskId"/><br/><br/>  

<input type="submit" value="Save"/>"  
</form>  