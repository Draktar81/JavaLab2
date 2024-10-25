package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RoomService {

    private List<Room> roomList;

    public RoomService(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Room> findRoomsByType(String type) {
        return roomList.stream()
                .filter(room -> room.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public Room findRoomByNumber(int number) {
        return roomList.stream()
                .filter(room -> room.getNumber() == number)
                .findFirst()
                .orElse(null);
    }

    public List<Room> sortRoomsByBeds() {
        return roomList.stream()
                .sorted(Comparator.comparingInt(Room::getBedCount))
                .collect(Collectors.toList());
    }
}
