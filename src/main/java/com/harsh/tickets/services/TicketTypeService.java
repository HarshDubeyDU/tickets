package com.harsh.tickets.services;

import com.harsh.tickets.domain.entities.Ticket;
import java.util.UUID;

public interface TicketTypeService {
  Ticket purchaseTicket(UUID userId, UUID ticketTypeId);
}
