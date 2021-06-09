package com.cuemby.demo.core.services;

import com.cuemby.demo.core.models.Player;
import com.cuemby.demo.core.repositories.IPlayerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PlayerService implements IPlayerRepository {


    @Override
    public Page<Player> findByNameContainingIgnoreCase(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Player> findByTeamContainingIgnoreCase(String name, Pageable pageable) {
        return null;
    }
}
