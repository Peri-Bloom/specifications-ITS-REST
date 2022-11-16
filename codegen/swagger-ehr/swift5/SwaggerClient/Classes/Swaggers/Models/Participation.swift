//
// Participation.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Participation: Codable {

    public var function: DvText
    public var mode: DvCodedText?
    public var performer: PartyProxy
    public var time: DvIntervalOfDateTime?

    public init(function: DvText, mode: DvCodedText? = nil, performer: PartyProxy, time: DvIntervalOfDateTime? = nil) {
        self.function = function
        self.mode = mode
        self.performer = performer
        self.time = time
    }


}
