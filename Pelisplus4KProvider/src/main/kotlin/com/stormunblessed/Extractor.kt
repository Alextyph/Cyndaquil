package com.stormunblessed

import com.lagradost.cloudstream3.extractors.Filesim
import com.lagradost.cloudstream3.extractors.VidStack

class PelisplusUpnsPro : VidStack() {
    override var mainUrl = "https://pelisplus.upns.pro"
}
class EmturbovidCom : Filesim() {
    override var mainUrl = "https://emturbovid.com"
    override var name = "Emturbovid"
}