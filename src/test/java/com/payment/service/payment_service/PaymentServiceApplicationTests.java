package com.payment.service.payment_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//@SpringBootTest
class PaymentServiceApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	public static void main(String[] args) {
		var i = 65000L*15000L;

		System.out.println(sieve(i));
	}

	private static List<Integer> sieve(long upperbound){
		boolean[] isPrime = new boolean[(int)upperbound + 1];
		List<Integer> primes;

		for(int m = 2; m <= Math.sqrt(upperbound); m++){
			if(!isPrime[m]){
				for (int z = m*m; z <= upperbound; z += m){
					isPrime[z] = true;
				}
			}
		}

        primes = IntStream
				.range(2, isPrime.length)
				.filter(i -> !isPrime[i]).boxed()
				.collect(Collectors.toList());

		return primes;
    }
}
