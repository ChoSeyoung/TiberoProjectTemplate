package com.domain.module;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TiberoProjectTemplateApplicationTests {

	@Test
	void contextLoads() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setProvider(new BouncyCastleProvider());
		encryptor.setPoolSize(2);
		encryptor.setPassword("key");
		encryptor.setAlgorithm("PBEWithSHA256And128BitAES-CBC-BC");

		String plainText = "plainText";
		
		System.out.println("ENC : " + encryptor.encrypt(plainText));
		System.out.println("DEC : " + encryptor.decrypt(encryptor.encrypt(plainText)));
	}

}
