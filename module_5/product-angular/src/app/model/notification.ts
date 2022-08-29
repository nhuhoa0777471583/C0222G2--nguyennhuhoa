export interface NotificationPayload {
  title?: string,
  body?: string,
}

export interface MessagingPayload {
  notification: NotificationPayload,
  data?: { [key: string]: string }
}
