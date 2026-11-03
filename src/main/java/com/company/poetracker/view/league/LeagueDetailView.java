package com.company.poetracker.view.league;

import com.company.poetracker.entity.League;
import com.company.poetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "leagues/:id", layout = MainView.class)
@ViewController(id = "League.detail")
@ViewDescriptor(path = "league-detail-view.xml")
@EditedEntityContainer("leagueDc")
public class LeagueDetailView extends StandardDetailView<League> {
}
