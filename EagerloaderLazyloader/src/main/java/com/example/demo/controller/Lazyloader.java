package com.example.demo.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Lazyloader {
public Lazyloader() {
	System.out.println("Lazy Loader");
}
}
