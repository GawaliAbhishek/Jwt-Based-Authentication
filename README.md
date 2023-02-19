# Jwt-Based-Authentication

JSON web Token :- [JWT](https://jwt.io/) is an open standard (RFC 7519) for securely transmitting information between parties as JSON object. It is compact, readable and digitally signed using a private key/ or a public key pair by the Identity Provider(IdP).
JWT is a token based stateless authentication mechanism. Since it is a client-side based stateless session, server doesn't have to completely rely on a datastore(database) to save session information.

JWT and Spring Security :- A JWT token contains all the required information about an entity, which can be a user or a service.
 A JWT token is divided into 3 parts namely – header, payload, and signature in the format of
[Header].[Payload].[Signature]. which is genrated by spring security

This figure shows a typical use case of JWT authentication.



![image](https://user-images.githubusercontent.com/89680568/219931751-20c53aac-65aa-4a53-9464-9b6581406513.png)



# Project Details
 Used the Spring Security 6 to implement the JWT based Authentication
 the application genrates the json web token which is proper encrypted by using HS256 Algorithm
 Genarated token is verfied with base 64 security key to ensure that token has not been modified in between 
 Token Expires in 24 hours so if same token is given after 24 hours application doesnot validates it
 
 All the end points are secured and cannot be accesed without authentication
 only the register and authenticate services are public which are used to register and autheticate user request
 
 
 # Some Glimpse to Output
 
 
 Terminal Log Output
 
![Screenshot (13)](https://user-images.githubusercontent.com/89680568/219932395-410826cf-5b94-49d3-a952-36988dc50022.png)



Genarated Json Web Token by given data to register user

![Screenshot (14)](https://user-images.githubusercontent.com/89680568/219932418-26207bb8-a08e-4650-a87f-5a6961453955.png)



Encoded and Decoded form of JWT token

![Screenshot (15)](https://user-images.githubusercontent.com/89680568/219932448-f7dc304f-5698-4769-bd5d-634ffab0174c.png)


