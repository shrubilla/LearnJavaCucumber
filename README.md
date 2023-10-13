1.src/test/java/features - all the cucumber features files (files .feature ext) goes here.
2.src/test/java/stepDefinitions - all the step definitions files will be created here (.java ext)
3.src/test/java/CucumberOptions - This is the runner file created under it , where we give feature file and definition file locations and implements testNG . Here i used testNG 
4.src/test/java/utils - This package contains browser initialization , reusable components 
5.src/test/java/pageObjects - Here i have used page object model , all the elements and methods are created under this package . this helps code re-usability and maintenance will be easy as product pages and flows increases 
6.Note: I have used WebDriverManager artifact so browser download, path versions dependency will be taken care from this library
7.I have used Maven project here and pom.xml will have all the dependencies

