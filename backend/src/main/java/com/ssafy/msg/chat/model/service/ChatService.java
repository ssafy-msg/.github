package com.ssafy.msg.chat.model.service;



import com.ssafy.msg.chat.model.dto.CreateRoomDto;
import com.ssafy.msg.chat.model.dto.RoomDto;

import java.util.List;
import java.util.Map;

public interface ChatService {

    Map getPersonalRoom(CreateRoomDto createRoomDto) throws Exception;

    List<RoomDto> getPersonalRoomsInfoById(int id) throws Exception;

}
