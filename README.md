Integration of gradle cucumber and spring boot.
    Spring boot has been added as an IOC to cleanup code

Running the test
Get an access token from the website:- https://gorest.co.in/
Update application.yml
Run the test using - `gradle cucumberCli`

Note:- if you are using Java 11 onwards - then @PostConstuct might not work for you. You have to add the following  to the following dependency to your gradle- 
`implementation "javax.annotation:javax.annotation-api:1.3.2"` 