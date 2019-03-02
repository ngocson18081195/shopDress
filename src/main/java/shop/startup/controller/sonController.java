package shop.startup.controller;

import org.aspectj.apache.bcel.util.Play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.startup.entity.Player;
import shop.startup.repository.sonRepository;

import java.util.LinkedList;
import java.util.List;

/**
 * Create by ngocson on 23/02/2019
 */
@RestController
@RequestMapping(path = "/son")
public class sonController {

    @Autowired
    private sonRepository sonRepository;

    @GetMapping("/create")
    public ResponseEntity create() {

        List<Player> players = new LinkedList<>();
        for (int i = 0; i < 500; i++) {
            Player son = new Player();
//        son.setId(1);
            son.setName("Son Ngoc" + i);
            players.add(son);
        }
        sonRepository.saveAll(players);

        return ResponseEntity.ok(players);
    }
}
