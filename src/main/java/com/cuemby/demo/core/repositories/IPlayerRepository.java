package com.cuemby.demo.core.repositories;

import com.cuemby.demo.core.models.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPlayerRepository {
    Page<Player> findByNameContainingIgnoreCase (String name, Pageable pageable);
    Page<Player> findByTeamContainingIgnoreCase (String name, Pageable pageable);
}
