package org.example;

import org.springframework.stereotype.Component;

@Component
public class BluesMusic implements Music{
    @Override
    public String getSong() {
        return "Buckethead - Three lee s gone";
    }
}
