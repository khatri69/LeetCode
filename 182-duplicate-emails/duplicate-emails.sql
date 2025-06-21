Select email as Email
From Person
Group by email
Having COUNT(email) >1;