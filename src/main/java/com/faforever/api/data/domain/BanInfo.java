package com.faforever.api.data.domain;

import com.yahoo.elide.annotation.Include;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "lobby_ban")
@Include(rootLevel = true, type = "banInfo")
@Setter
public class BanInfo {

  private int id;
  private Player player;
  private String reason;
  private OffsetDateTime expiresAt;

  @Id
  @Column(name = "idUser")
  public int getId() {
    return id;
  }

  @OneToOne
  @JoinColumn(name = "idUser", updatable = false)
  public Player getPlayer() {
    return player;
  }

  @Column(name = "reason")
  public String getReason() {
    return reason;
  }

  @Column(name = "expires_at")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }
}
