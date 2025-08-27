function validate()
{
    let uname=document.getElementById("uname").value.trim();
    let pass=document.getElementById("pass").value.trim();
    let dob=document.getElementById("dob").value.trim();

    if(uname.length==0)
    {
        userError.innerHTML="Name is required";
        return false;
    }
    else if(!uname.match(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/))
    {
        userError.innerHTML="Email should be given";
        return false;
    }
    else{
        userError.innerHTML="";
    }
    


    if(pass.length==0)
        {
            // uname.style.border="solid 3px red";
            passError.innerHTML="password is required";
            return false;
        }
        else if(!pass.match(/^[0-9]{5,8}$/))
        {
            passError.innerHTML="Invalid password : only numbers length upto 8";
            return false;
        }

        else{
        passError.innerHTML="";
        } 

        if(dob.length==0)
            {
                // uname.style.border="solid 3px red";
                dobError.innerHTML="DOB is required";
                return false;
            }
            else if(!dob.match(/^[0-9]{1,2}\/[0-9]{1,2}\/[0-9]{4}$/))
                {
                    dobError.innerHTML="Invalid dob";
                    return false;
                }
                else{
                    dobError.innerHTML="";
                    } 
}