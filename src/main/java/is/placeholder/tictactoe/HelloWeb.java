package is.placeholder.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class HelloWeb implements SparkApplication {
    public static void main(String[] args){
        staticFileLocation("/public");
        SparkApplication helloweb = new HelloWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        helloweb.init(); 
    }

    public void init(){
        
        post(new Route("/gethi"){
            @Override
            public Object handle(Request request, Response response){
                String hello = "Hello world";
                return hello;
            }
	    });
    }
}