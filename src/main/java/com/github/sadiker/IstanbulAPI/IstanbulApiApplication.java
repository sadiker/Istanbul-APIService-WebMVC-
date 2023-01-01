package com.github.sadiker.IstanbulAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.sadiker.IstanbulAPI.models.district.Continent;
import com.github.sadiker.IstanbulAPI.models.district.District;
import com.github.sadiker.IstanbulAPI.repository.DistrictRepository;


@SpringBootApplication
public class IstanbulApiApplication {

	@Autowired
	DistrictRepository districtRepository;

	public static void main(String[] args) {
		SpringApplication.run(IstanbulApiApplication.class, args);
	}

	@Bean
	CommandLineRunner clr() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				fullfillDatabase(districtRepository);
			}

			private void fullfillDatabase(DistrictRepository districtRepository) {
				Continent anadolu = Continent.ANADOLU;
				Continent avrupa = Continent.AVRUPA;
				Continent ada = Continent.ADA;
				District d1 = new District("Bakırköy", 228_000L, avrupa);
				districtRepository.save(d1);
				District d2 = new District("Esenyurt", 977_000L, avrupa);
				districtRepository.save(d2);
				District d3 = new District("Küçükçekmece", 805_000L, avrupa);
				districtRepository.save(d3);
				District d4 = new District("Bağcılar", 744_000L, avrupa);
				districtRepository.save(d4);
				District d5 = new District("Pendik", 741_000L,anadolu );
				districtRepository.save(d5);
				District d6 = new District("Ümraniye", 726_000L, anadolu);
				districtRepository.save(d6);
				District d7 = new District("Bahçelievler", 605_000L, avrupa);
				districtRepository.save(d7);
				District d8 = new District("Sultangazi", 543_000L, avrupa);
				districtRepository.save(d8);
				District d9 = new District("Maltepe", 525_000L, anadolu);
				districtRepository.save(d9);
				District d10 = new District("Üsküdar", 525_000L, anadolu);
				districtRepository.save(d10);
				District d11= new District("Başakşehir", 503_000L, avrupa);
				districtRepository.save(d11);
				District d12 = new District("Gaziosmanpaşa", 493_000L, avrupa);
				districtRepository.save(d12);
				District d13 = new District("Kadıköy", 485_000L, anadolu);
				districtRepository.save(d13);
				District d14 = new District("Sancaktepe", 474_000L, anadolu);
				districtRepository.save(d14);
				District d15 = new District("Avcılar", 457_000L, avrupa);
				districtRepository.save(d15);
				District d16 = new District("Kağıthane", 454_000L, avrupa);
				districtRepository.save(d16);
				District d17 = new District("Esenler", 447_000L, avrupa);
				districtRepository.save(d17);
				District d18 = new District("Ataşehir", 427_000L, anadolu);
				districtRepository.save(d18);
				District d19 = new District("Eyüpsultan", 417_000L, avrupa);
				districtRepository.save(d19);
				District d20 = new District("Beylikdüzü", 398_000L, avrupa);
				districtRepository.save(d20);
				District d21 = new District("Fatih", 382_000L, avrupa);
				districtRepository.save(d21);
				District d22 = new District("Sarıyer", 349_000L, avrupa);
				districtRepository.save(d22);
				District d23 = new District("Sultanbeyli", 349_000L, anadolu);
				districtRepository.save(d23);
				District d24 = new District("Arnavutköy", 312_000L, avrupa);
				districtRepository.save(d24);
				District d25 = new District("Zeytinburnu", 293_000L, avrupa);
				districtRepository.save(d25);
				District d26 = new District("Çekmeköy", 288_000L, anadolu);
				districtRepository.save(d26);
				District d27 = new District("Tuzla", 284_000L, anadolu);
				districtRepository.save(d27);
				District d28 = new District("Şişli", 284_000L, avrupa);
				districtRepository.save(d28);
				District d29 = new District("Güngören", 283_000L, avrupa);
				districtRepository.save(d29);
				District d30 = new District("Bayrampaşa", 274_000L, avrupa);
				districtRepository.save(d30);
				District d31 = new District("Büyükçekmece", 269_000L, avrupa);
				districtRepository.save(d31);
				District d32 = new District("Beykoz", 248_000L, anadolu);
				districtRepository.save(d32);
				District d33 = new District("Beyoğlu", 233_000L, avrupa);
				districtRepository.save(d33);
				District d34 = new District("Kartal", 480_000L, avrupa);
				districtRepository.save(d34);
				District d35 = new District("Silivri", 209_000L, avrupa);
				districtRepository.save(d35);
				District d36 = new District("Beşiktaş", 178_000L, avrupa);
				districtRepository.save(d36);
				District d37 = new District("Çatalca", 76_000L, avrupa);
				districtRepository.save(d37);
				District d38 = new District("Şile", 41_000L, anadolu);
				districtRepository.save(d38);
				District d39 = new District("Adalar", 16_372L, ada);
				districtRepository.save(d39);
			}

		};
	}

}
