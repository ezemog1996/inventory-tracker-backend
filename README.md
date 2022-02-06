# Inventory-Tracker-Backend ![](https://img.shields.io/badge/license-MIT-green)

Link to App: https://ezemog1996.github.io/Inventory-Tracker-Backend/

## Table of Contents

[Description](https://github.com/ezemog1996/Inventory-Tracker-Backend#description)

[Installation](https://github.com/ezemog1996/Inventory-Tracker-Backend#installation)

[Usage](https://github.com/ezemog1996/Inventory-Tracker-Backend#usage)

[Tests](https://github.com/ezemog1996/Inventory-Tracker-Backend#tests)

[License](https://github.com/ezemog1996/Inventory-Tracker-Backend#license)

[Questions](https://github.com/ezemog1996/Inventory-Tracker-Backend#questions)

### Description

This is a microservice project using Spring Cloud to establish an API Gateway, Service Discovery, and services that work as an inventory tracking system.

### Installation

Must have Java 8 and Maven installed. Clone this repository. Run each application using mvn spring-boot:run within their root folder. Run inventory_tracker_gateway and service_discovery first, then run the rest of the services.

### Usage

This application will be used for tracking inventory. Currently it handles POST requests to each service, one GET request to the business service, and one GET request from the category service to the buisiness service. The requests should be sent through the API gateway.


### Tests

Once all services as well at the gateway and service discovery are running, send POST requests with the correct JSON models to localhost:8080 to these endpoints: /businesses, /categories, /items, /locations. You should receive a response body containing the same data that was send. GET /businesses should response with an array of businesses and GET /categories/businesses should do the same.

### License


                MIT License

                Copyright (c) 2022 Enrique Gomez
                
                Permission is hereby granted, free of charge, to any person obtaining a copy
                of this software and associated documentation files (the "Software"), to deal
                in the Software without restriction, including without limitation the rights
                to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
                copies of the Software, and to permit persons to whom the Software is
                furnished to do so, subject to the following conditions:
                
                The above copyright notice and this permission notice shall be included in all
                copies or substantial portions of the Software.
                
                THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
                IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
                FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
                AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
                LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
                OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
                SOFTWARE.

### Questions

GitHub Profile: https://github.com/ezemog1996

Email: enrique_g_gomez@outlook.com 

Contact me through the issues panel on for this project or send me an email with any questions about this project.