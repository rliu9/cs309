<?php

require "init.php";
$username = $_POST["username"];
$password = $_POST["password"];

$sql = "select * from users where username like '".$username."';";

$result = mysqli_query($con, $sql);
$response = array();

if(mysqli_num_rows($result)>0)
{
	$code = "register_failed";
	$message = "User exists.";
	array_push($response,array("code"=>$code, "message"=>$message));
	echo json_encode($response);
}
else
{
	$code = "register_success";
	$message = "Thanks!";
	array_push($response, array("code"=>$code, "message"=>$message));
	echo json_encode($response);
}

mysqli_close($con);


?>