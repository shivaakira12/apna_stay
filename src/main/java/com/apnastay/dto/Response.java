package com.apnastay.dto;


import com.fasterxml.jackson.annotation.JsonInclude;


import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmationCode;

    private UserDTO userDTO;
    private RoomDTO roomDTO;
    private BookingDTO bookingDTO;

    private List<UserDTO> userDTOList;
    private List<RoomDTO> roomDTOList;
    private List<BookingDTO> bookingDTOList;

    public Response(int statusCode, String message, String token, String role, String expirationTime, String bookingConfirmationCode, UserDTO userDTO, RoomDTO roomDTO, BookingDTO bookingDTO, List<UserDTO> userDTOList, List<RoomDTO> roomDTOList, List<BookingDTO> bookingDTOList) {
        this.statusCode = statusCode;
        this.message = message;
        this.token = token;
        this.role = role;
        this.expirationTime = expirationTime;
        this.bookingConfirmationCode = bookingConfirmationCode;
        this.userDTO = userDTO;
        this.roomDTO = roomDTO;
        this.bookingDTO = bookingDTO;
        this.userDTOList = userDTOList;
        this.roomDTOList = roomDTOList;
        this.bookingDTOList = bookingDTOList;
    }

    public Response() {

    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getBookingConfirmationCode() {
        return bookingConfirmationCode;
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public RoomDTO getRoomDTO() {
        return roomDTO;
    }

    public void setRoomDTO(RoomDTO roomDTO) {
        this.roomDTO = roomDTO;
    }

    public BookingDTO getBookingDTO() {
        return bookingDTO;
    }

    public void setBookingDTO(BookingDTO bookingDTO) {
        this.bookingDTO = bookingDTO;
    }

    public List<UserDTO> getUserDTOList() {
        return userDTOList;
    }

    public void setUserDTOList(List<UserDTO> userDTOList) {
        this.userDTOList = userDTOList;
    }

    public List<RoomDTO> getRoomDTOList() {
        return roomDTOList;
    }

    public void setRoomDTOList(List<RoomDTO> roomDTOList) {
        this.roomDTOList = roomDTOList;
    }

    public List<BookingDTO> getBookingDTOList() {
        return bookingDTOList;
    }

    public void setBookingDTOList(List<BookingDTO> bookingDTOList) {
        this.bookingDTOList = bookingDTOList;
    }
}
