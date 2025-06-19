package com.ganesh.springapi.issues;

public class issues {
    //  1)add @RestController annotation to the controller class and add dependency of other class this controller class--> I was getting "defining a bean of type 'com.ganesh.springapi.services.ProductService
    //  I remove the @Restcontroller anotation and error gone

    // Acctually issue was i was defining interface as @servce and implimentation of product class as abstract class thats why I was getting this error
    // what i have learnt If I annotate any class as @service or @Component or @Controller or @RestController then it
    // should be concrete class not abstract class and also it should not be an interface and it should not be an enum and we can create bean of that class
}
