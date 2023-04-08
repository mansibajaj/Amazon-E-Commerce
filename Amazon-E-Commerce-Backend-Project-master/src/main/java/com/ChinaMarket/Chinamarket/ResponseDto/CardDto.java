package com.ChinaMarket.Chinamarket.ResponseDto;

import com.ChinaMarket.Chinamarket.Enum.CardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDto {

    private String cardNo;

    private CardType cardType;
}

// we hide the important information of card.