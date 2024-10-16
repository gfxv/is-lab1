package dev.gfxv.lab1.repository;

import dev.gfxv.lab1.dao.SpaceMarineDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceMarineRepository extends JpaRepository<SpaceMarineDAO, Long> {
}