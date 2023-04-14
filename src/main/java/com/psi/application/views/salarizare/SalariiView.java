package com.psi.application.views.salarizare;

import com.psi.application.views.MainLayout;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Salarii")
@Route(value = "salarii", layout = MainLayout.class)
@RouteAlias(value = "salariile", layout = MainLayout.class)
@Uses(Icon.class)
public class SalariiView extends Div {

    H1 text = new H1 ("Here should be a nice salary");

    public SalariiView() {

        add (text);
    }
}
