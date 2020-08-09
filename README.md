# CONFIGURATION FILES PARSER

### This application read different configuration files depending on the level of development.  

The three (3) level of development used for the application are :
```
* Production
* Staging 
* Development

```

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.  

### Prerequisites

To get this application up and running, you need at minimum the following:  

```
* JDK version 8 and above
* Git

```

### Installing and Contribution. 

```
* To get the project on your machine, you can clone by runing " git clone https://github.com/DavidOparanti/Config_Parser.git"  
* ...
```
The raw code is under SRC directory.  

### How to:
````
ConfigParser config = new ConfigParser();   // for production environment
ConfigParser config = new ConfigParser(“name_of_file”); for staging and developement enviroment

config object has a get method that accept string key as argument.
This return the value of key passed in as arguemnt.

````
## Handling Error:
````
1 "Invalid key {key}" is returned if key does not exit in the config map object
2 "Invalid Environment. Do you mean staging or development or production?\n" +
                  "For production environment, call without passing any argument\n" +
                  "e.g {java Main}               for production environment\n" +
                  "    {java Main development}   for development environment\n" +
                  "    {java Main staging}       for staging environment"; "  
... is returned if Wrong environmet used doing program start up. 
````
## Acknowledgments
* * All Decagon Java Stack Leads and associates.(For taking out time to putting us through.)
* * Decagon (for providing enabling environment to learn.)
* * My Stack colleagues.(These are amazing individual.) 

