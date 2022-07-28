package com.example.ecr.util;

import com.example.ecr.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CheckVal {

    public boolean isValuePositive(int qoh, int price) {
        if(qoh >= 0 && price >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
