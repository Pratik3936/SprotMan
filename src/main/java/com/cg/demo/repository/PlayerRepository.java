package com.cg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.demo.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
