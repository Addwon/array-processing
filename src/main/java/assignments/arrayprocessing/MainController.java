package assignments.arrayprocessing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/array")

    public String arrayProcessing(@RequestParam("size") int num) {
        int sum=0;
        int average=0;

        int[] arrayElements = new int[num];
        Scanner scanner = new Scanner(System.in);
        int elements;
        System.out.println("Enter array elements: \n");
        for(int i=0;i<num;i++){
            elements= scanner.nextInt();
            sum+=elements;
        }
        average=sum/num;
        return "Sum = "+sum +"<br/>"+"Average = "+average;
    }
    /*
    @RequestMapping("/elements")
    public int elements(@RequestParam("integers") int integer){
        return integer;
    }*/
}
