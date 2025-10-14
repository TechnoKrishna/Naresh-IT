let isLogin = false;
let username;
let password;

while(!isLogin)
{
    username = window.prompt("Enter Username : ");
    password = window.prompt("Enter Password : ");

    if(username === "myUsername" && password === "myPassword")
    {
        isLogin = true;
        console.log("You are logged in!");
    }
    else
    {
        console.log("Invalid Credentials! Please Try Again");
        
    }

}