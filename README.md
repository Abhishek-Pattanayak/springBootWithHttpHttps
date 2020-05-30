## springBootWithHttpHttps
Spring boot example with both Http and Https enabled

## Steps to test the application
- Generate PKCS file by navigating to your Program Files\Java\jdk1.8.0_241\bin (***jdk version to be replaced with your installed version***) folder. Open the command prompt as Administrator and run below command,
***keytool -genkeypair -alias selfsigned_localhost_sslserver -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore example-ssl-key.p12 -validity 3650***
- You can now see a file with name example-ssl-key.p12 generated in your bin folder where you opened the command prompt.
- Copy that file to src/main/resource folder of the project structure.
- Then run the application as Java application and hit below URLs

***Test to check HTTPS***
https://localhost:8081/testssl

***Test to check HTTP***
http://localhost:8082/testssl
