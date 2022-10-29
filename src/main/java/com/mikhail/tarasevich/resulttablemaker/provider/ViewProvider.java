package com.mikhail.tarasevich.resulttablemaker.provider;

import java.util.List;

import com.mikhail.tarasevich.resulttablemaker.domain.Racer;

public interface ViewProvider {
    String provideResultTableView (List<Racer> racerList, int outOfQualificationLine);
}
