package com.mudzingwa.sec.Repositories.Projection;

import java.time.LocalDateTime;

public interface IPurchaseItem {
String getTiltle();
Double getPrice();
LocalDateTime getPurchaseTime();
}
