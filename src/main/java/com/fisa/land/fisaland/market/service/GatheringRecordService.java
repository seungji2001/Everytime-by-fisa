package com.fisa.land.fisaland.market.service;

import java.util.List;

import com.fisa.land.fisaland.market.dto.GatheringRecordDTO;

public interface GatheringRecordService {
	
    Long joinGathering(Long userId, Long gatheringRecordInfoId);
    
    void deleteGatheringRecord(Long gatheringRecordId);

    List<GatheringRecordDTO> getGatheringRecordsByUserId(Long userId);
    
}
