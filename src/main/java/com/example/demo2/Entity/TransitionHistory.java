package com.example.demo2.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "TransitionHistory")
public class TransitionHistory {
    public double accountId;
    public int accountNum;
    public String accountCompCode;
    public List<TransitionHistoryDetails> details;

}
