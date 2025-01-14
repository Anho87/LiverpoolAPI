package com.example.liverpoolapi;

import com.example.liverpoolapi.Player.Player;
import com.example.liverpoolapi.Position.Position;
import com.example.liverpoolapi.Player.PlayerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
public class DataLoader implements CommandLineRunner {

    private final PlayerRepository playerRepository;

    @Value("${insert.dummy.data}")
    private boolean insertDummyData;

    public DataLoader(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... args)  {
        if (insertDummyData) {
            if (playerRepository.count() == 0) {
                playerRepository.save(new Player(UUID.randomUUID(), "Mohamed Salah", 11, LocalDate.of(1992, 6, 15), "Egypt", 1.75, Position.FORWARD));
                playerRepository.save(new Player(UUID.randomUUID(), "Virgil van Dijk", 4, LocalDate.of(1991, 7, 8), "Netherlands", 1.93, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Alisson Becker", 1, LocalDate.of(1992, 10, 2), "Brazil", 1.91, Position.GOALKEEPER));
                playerRepository.save(new Player(UUID.randomUUID(), "Sadio Mane", 10, LocalDate.of(1992, 4, 10), "Senegal", 1.75, Position.FORWARD));
                playerRepository.save(new Player(UUID.randomUUID(), "Roberto Firmino", 9, LocalDate.of(1991, 10, 2), "Brazil", 1.81, Position.FORWARD));
                playerRepository.save(new Player(UUID.randomUUID(), "Trent Alexander-Arnold", 66, LocalDate.of(1998, 10, 7), "England", 1.83, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Andrew Robertson", 26, LocalDate.of(1994, 3, 11), "Scotland", 1.78, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Fabinho", 3, LocalDate.of(1993, 10, 23), "Brazil", 1.88, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Jordan Henderson", 14, LocalDate.of(1990, 6, 17), "England", 1.82, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "James Milner", 7, LocalDate.of(1986, 1, 4), "England", 1.75, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Diogo Jota", 20, LocalDate.of(1996, 12, 4), "Portugal", 1.78, Position.FORWARD));
                playerRepository.save(new Player(UUID.randomUUID(), "Luis Díaz", 23, LocalDate.of(1997, 1, 13), "Colombia", 1.74, Position.FORWARD));
                playerRepository.save(new Player(UUID.randomUUID(), "Caoimhin Kelleher", 62, LocalDate.of(1998, 11, 23), "Ireland", 1.91, Position.GOALKEEPER));
                playerRepository.save(new Player(UUID.randomUUID(), "Ibrahima Konaté", 5, LocalDate.of(1999, 3, 25), "France", 1.92, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Joe Gomez", 12, LocalDate.of(1997, 5, 23), "England", 1.82, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Joel Matip", 32, LocalDate.of(1991, 8, 8), "Cameroon", 1.95, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Naby Keïta", 8, LocalDate.of(1995, 2, 10), "Guinea", 1.72, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Harvey Elliott", 19, LocalDate.of(2003, 4, 4), "England", 1.71, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Thiago Alcântara", 6, LocalDate.of(1991, 4, 11), "Spain", 1.74, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Ben Davies", 28, LocalDate.of(1995, 1, 11), "England", 1.85, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Alex Oxlade-Chamberlain", 15, LocalDate.of(1993, 8, 15), "England", 1.79, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Arthur Melo", 29, LocalDate.of(1996, 8, 12), "Brazil", 1.72, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Sepp van den Berg", 38, LocalDate.of(2001, 12, 20), "Netherlands", 1.90, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Leighton Clarkson", 42, LocalDate.of(2002, 10, 6), "England", 1.74, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Dominik Szoboszlai", 8, LocalDate.of(2000, 10, 25), "Hungary", 1.85, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Alexis Mac Allister", 10, LocalDate.of(1998, 10, 24), "Argentina", 1.78, Position.MIDFIELDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Kostas Tsimikas", 21, LocalDate.of(1996, 5, 12), "Greece", 1.75, Position.DEFENDER));
                playerRepository.save(new Player(UUID.randomUUID(), "Curtis Jones", 17, LocalDate.of(2001, 1, 30), "England", 1.80, Position.MIDFIELDER));
            }
            System.out.println("Dummy data inserted.");
        } else {
            System.out.println("Dummy data insertion skipped.");
        }
    }
}

