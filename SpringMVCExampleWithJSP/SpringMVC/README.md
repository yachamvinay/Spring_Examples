# Spring Boot MVC

- To Create application

	- Add web dependency to the web application
	
## Common Annotations

###@SpringBootApplication 

- auto configuration of the application 

## What is Controller
- the Java class responsible to return the next step
- To Mark the class as controller we can use 
	- @Controller
	
		-also needed @RequestMapping to tell which is the base url
		- was used in spring applications
		 
	- @RestController
		- combo of @Controller+@RequestMappring
		
	
###@GetMapping
- map your method with the Http Get Request
###@PostMapping
- map your methos with the http Post Request
###@RequestParam
	- to get the params from the UI 
- 
 