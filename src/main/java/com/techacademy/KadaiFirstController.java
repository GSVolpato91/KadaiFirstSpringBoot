package com.techacademy;


import java.time.DayOfWeek;
import java.time.LocalDate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{val1}")
    public String dispDayOfWeek (@PathVariable int val1) {

        int i = val1;
        String s = String.valueOf(i);
        String year = s.substring(0, 4);
        String month = s.substring(4, 6);
        String day = s.substring(6, 8);

        LocalDate ld = LocalDate.of (
                Integer.parseInt(year),
                Integer.parseInt(month),
                Integer.parseInt(day));
        DayOfWeek w = ld.getDayOfWeek ();
        return "計算結果：" + w.toString();


  }

     @GetMapping("/plus/{num1}/{num2}")
        public String calcPlus(@PathVariable int num1, @PathVariable int num2) {
        int res = 0;
        res = num1 + num2;
        return "計算結果：" + res;
}
    @GetMapping("/minus/{num1}/{num2}")
        public String calcMinus (@PathVariable int num1, @PathVariable int num2) {
        int res = 0;
        res = num1 - num2 ;
        return "計算結果：" + res;
    }
    @GetMapping("/times/{num1}/{num2}")
        public String calcTimes (@PathVariable int num1, @PathVariable int num2) {
        int res = 0;
        res = num1 * num2 ;
        return "計算結果：" + res;
    }
    @GetMapping("/divide/{num1}/{num2}")
        public String calcDivide (@PathVariable int num1, @PathVariable int num2) {
        int res = 0;
        res = num1 / num2;
        return "計算結果：" + res;

    }
}
