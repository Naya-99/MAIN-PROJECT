function onSubmit()
{


const name = document.getElementById('name')
const age = document.getElementById('age')
const gender = document.getElementById('gender')
const form = document.getElementById('form')
const errorElement =document.getElementById('error')
const error = document.getElementById('error1')
const wrong = document.getElementById('error2')

form.addEventListener('submit', (e) => {
    
    let messages = []
    let ageMessage = []
    let errMsg = []
    if(name.value === '' || name.value ==null  )
    {
        messages.push('Farmer name cannot be empty')
    }
     
    else if(name.value.length < 5)
    {
        messages.push('Farmer name should be greater than 5 char and max 12')
        
    }
   else {
    messages.push(" ")
   
   
   }
    
     if(messages.length > 0)
    {
        e.preventDefault()
        errorElement.innerText=messages.join(', ')

    }

     if(age.value === '' || age.value ==null  )
    {
        ageMessage.push('Age is required')
    }
     
     else if(age.value.length < 18 && age.value.length >100)
    {
        ageMessage.push('Farmer age must be between 18 -100')
    }

    else{
        ageMessage.push(" ")
    }
    
     if( ageMessage.length > 0)
    {
        e.preventDefault()
        error.innerText= ageMessage.join(', ')

    }

    
return false;

})
}