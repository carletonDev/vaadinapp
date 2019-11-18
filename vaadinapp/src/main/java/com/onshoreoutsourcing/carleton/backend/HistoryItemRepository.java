package com.onshoreoutsourcing.carleton.backend;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onshoreoutsourcing.carleton.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
