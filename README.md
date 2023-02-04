# Employee Management (Team mapping and TimeTracker)

Provides REST APIs for the Employee Management domain of the Employer. 

## Development

## Requirements
1. Java 8
2. Postgresql Database
3. Maven
4. Postman to test API

## Build
This project uses the default repository of maven To configure this repository:

1. Create a settings.xml

Run "mvn clean install" to build.



####  Database Connections

By default the configuration file at `/application.properties` has my local credentials for the connection to
the my local database. Before it can be used you must update the `spring.datasource.username`, and `spring.datasource.password`
properties with your personal credentials.


## Start Application

It starts as a normal spring boot application.(8080 port as default). 
If you want to change the port, add application.properties server.port=#portNumber

## Rest APIs
POSTMAN Requests

1. localhost:8080/addEmployee

    RequestBody below
    
    {
        "firstName":"",
        "lastName": "",
        "email":"",
        "portfolio":"",
        "protfolioMgrId":"",
        "teamName":"",
        "teamMgrId":"",
        "designation":""
    }

2. localhost:8080/employeeDetails?email=inputMailId

3. localhost:8080/swipe
    RequestBody below
    
    {
        "empId":"",
        "type": "" 
    }
    type is swipe type(IN/OUT). Employee enter in to office,  type is IN. If they goes out from office, type is OUT



![image](https://user-images.githubusercontent.com/98741671/216782918-e5d20d12-cdd5-43b4-b4c5-77abc96e346f.png)



### Java Spring template project

This project is based on a GitLab [Project Template](https://docs.gitlab.com/ee/gitlab-basics/create-project.html).

Improvements can be proposed in the [original project](https://gitlab.com/gitlab-org/project-templates/spring).

### CI/CD with Auto DevOps

This template is compatible with [Auto DevOps](https://docs.gitlab.com/ee/topics/autodevops/).

If Auto DevOps is not already enabled for this project, you can [turn it on](https://docs.gitlab.com/ee/topics/autodevops/#enabling-auto-devops) in the project settings.
