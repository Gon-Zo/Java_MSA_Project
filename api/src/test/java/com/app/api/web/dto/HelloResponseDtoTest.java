package com.app.api.web.dto;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        String name = "tester1";
        int amount = 100;
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        // 검증
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }
}