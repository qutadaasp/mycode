using DocumentFormat.OpenXml.Drawing.Charts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using WebApplication7;

namespace WebApplication1.Controllers
{
    public class ValuesController : ApiController
    {
        // GET api/values
        public IEnumerable<string> Get()
        {
            return new string[] { "value1", "value2" };
        }

        // GET api/values/5
        public Double Get(string permit, string quality, string health, string material, string slope,
            string landtype, string withinf
            , string landlocation, string rent, string elevator, string floor, string park
            , string propertycontract, string rebound
            , string pavedstreet, string streetype, string vitalcenter, string services, string streetnumber, string prices, int id, int pid)
        {
            //withoutf delete
            using (ExpertSystemEntities entities = new ExpertSystemEntities())
            {
                //quality and health
                object qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitygood).FirstOrDefault();
                object heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthgood).FirstOrDefault();
                object mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                if (quality.Equals("good"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitygood).FirstOrDefault();
                    //decimal value for quality good from database
                    if (health.Equals("good"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthgood).FirstOrDefault();
                        //decimal value for health good from database
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }



                    }
                }
                if (quality.Equals("bad"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitybad).FirstOrDefault();
                    if (health.Equals("good"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthgood).FirstOrDefault();
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }


                    }
                }

                if (quality.Equals("good"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitygood).FirstOrDefault();
                    if (health.Equals("bad"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthbad).FirstOrDefault();
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }


                    }
                }
                if (quality.Equals("bad"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitybad).FirstOrDefault();
                    if (health.Equals("bad"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthbad).FirstOrDefault();
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }


                    }
                }
                //slope
                object sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.littleslope).FirstOrDefault();
                object lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                if (slope.Equals("little"))
                {
                    sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.littleslope).FirstOrDefault();
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.agriculturalland).FirstOrDefault();
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.sandland).FirstOrDefault();
                    }

                }
                if (slope.Equals("large"))
                {
                    sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.largeslope).FirstOrDefault();
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.agriculturalland).FirstOrDefault();
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.sandland).FirstOrDefault();
                    }
                }

                if (slope.Equals("midle"))
                {
                    sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.midslope).FirstOrDefault();
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.agriculturalland).FirstOrDefault();
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.sandland).FirstOrDefault();
                    }
                }
                //elevator
                object elv = entities.Attributes.Where(e => e.ID == id).Select(e => e.elevatorexist).FirstOrDefault();
                object floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.landfloar).FirstOrDefault();
                if (elevator.Equals("exist"))
                {
                    elv = entities.Attributes.Where(e => e.ID == id).Select(e => e.elevatorexist).FirstOrDefault();
                    if (floor.Equals("landfloar"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.landfloar).FirstOrDefault();
                    }
                    else if (floor.Equals("midfloar"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.midfloar).FirstOrDefault();
                    }
                    else if (floor.Equals("upperfloar"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.upperfloar).FirstOrDefault();
                    }
                    else if (floor.Equals("underland"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.underlandfloar).FirstOrDefault();
                    }

                }
                if (elevator.Equals("notexist"))
                {
                    elv = entities.Attributes.Where(e => e.ID == id).Select(e => e.elavatornotexist).FirstOrDefault();
                    if (floor.Equals("landfloar"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.landfloar).FirstOrDefault();
                    }
                    else if (floor.Equals("midfloar"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.midfloar).FirstOrDefault();
                    }
                    else if (floor.Equals("upperfloar"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.upperfloar).FirstOrDefault();
                    }
                    else if (floor.Equals("underland"))
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.underlandfloar).FirstOrDefault();
                    }
                }
                //prices
                object pr = entities.Price.Where(e => e.prid == pid).Select(e => e.South).FirstOrDefault();
                if (prices.Equals("east"))
                {
                    pr = entities.Price.Where(e => e.prid == pid).Select(e => e.East).FirstOrDefault();
                }
                else if (prices.Equals("west"))
                {
                    pr = entities.Price.Where(e => e.prid == pid).Select(e => e.West).FirstOrDefault();
                }
                else if (prices.Equals("south"))
                {
                    pr = entities.Price.Where(e => e.prid == pid).Select(e => e.South).FirstOrDefault();
                }
                else if (prices.Equals("north"))
                {
                    pr = entities.Price.Where(e => e.prid == pid).Select(e => e.North).FirstOrDefault();
                }
                //inside and outside 
                object inout = entities.Attributes.Where(e => e.ID == id).Select(e => e.withinf).FirstOrDefault();
                object locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.A).FirstOrDefault();
                if (withinf.Equals("inside"))
                {
                    inout = entities.Attributes.Where(e => e.ID == id).Select(e => e.withinf).FirstOrDefault();
                    if (landlocation.Equals("A"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.A).FirstOrDefault();
                    }
                    else if (landlocation.Equals("B"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.B).FirstOrDefault();
                    }
                    else if (landlocation.Equals("C"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.C).FirstOrDefault();
                    }
                    else if (landlocation.Equals("D"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.D).FirstOrDefault();
                    }

                }
                else if (withinf.Equals("outside"))
                {
                    inout = entities.Attributes.Where(e => e.ID == id).Select(e => e.withoutf).FirstOrDefault();
                }
                //paved rules
                object pav = entities.Attributes.Where(e => e.ID == id).Select(e => e.paved).FirstOrDefault();
                object strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.Residential).FirstOrDefault();
                object strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                object vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                object existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                if (pavedstreet.Equals("paved"))
                {
                    pav = entities.Attributes.Where(e => e.ID == id).Select(e => e.paved).FirstOrDefault();
                    if (streetype.Equals("residential"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.Residential).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }

                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                    else if (streetype.Equals("commerical"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.commerical).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                }
                else if (pavedstreet.Equals("unpaved"))
                {
                    pav = entities.Attributes.Where(e => e.ID == id).Select(e => e.unpaved).FirstOrDefault();
                    if (streetype.Equals("residential"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.Residential).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                    else if (streetype.Equals("commerical"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.commerical).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                }
                // parking
                object parking = entities.Attributes.Where(e => e.ID == id).Select(e => e.parkingexist).FirstOrDefault();
                if (park.Equals("exist"))
                {
                    parking = entities.Attributes.Where(e => e.ID == id).Select(e => e.parkingexist).FirstOrDefault();
                }
                else if (park.Equals("notexist"))
                {
                    parking = entities.Attributes.Where(e => e.ID == id).Select(e => e.parkingnotexist).FirstOrDefault();
                }
                // rebound
                object reb = entities.Attributes.Where(e => e.ID == id).Select(e => e.rebounds).FirstOrDefault();
                if (rebound.Equals("notexist"))
                {
                    reb = entities.Attributes.Where(e => e.ID == id).Select(e => e.rebounds).FirstOrDefault();
                }
                else if (rebound.Equals("exist"))
                {
                    reb = entities.Attributes.Where(e => e.ID == id).Select(e => e.reboundsexist).FirstOrDefault();
                }

                // propertycontract
                object proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.sorted).FirstOrDefault();
                if (propertycontract.Equals("sorted"))
                {
                    proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.sorted).FirstOrDefault();
                }
                else if (propertycontract.Equals("romured"))
                {
                    proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.romured).FirstOrDefault();
                }
                else if (propertycontract.Equals("financial"))
                {
                    proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.financial).FirstOrDefault();
                }

                // rent
                object old = entities.Attributes.Where(e => e.ID == id).Select(e => e.oldrent).FirstOrDefault();
                object newre = entities.Attributes.Where(e => e.ID == id).Select(e => e.newrent).FirstOrDefault();

                //permit
                object permitbuild = entities.Attributes.Where(e => e.ID == id).Select(e => e.buildingpermitexist).FirstOrDefault();
                if (permit.Equals("exist"))
                {

                    permitbuild = entities.Attributes.Where(e => e.ID == id).Select(e => e.buildingpermitexist).FirstOrDefault();
                }
                else if (permit.Equals("notexist"))
                {
                    permitbuild = entities.Attributes.Where(e => e.ID == id).Select(e => e.buildingpermitnotexist).FirstOrDefault();
                }



                object x = Convert.ToDouble(proper) + Convert.ToDouble(parking) + Convert.ToDouble(pav) + Convert.ToDouble(strnumber) + Convert.ToDouble(strtype) + Convert.ToDouble(vita) + Convert.ToDouble(existserv) + Convert.ToDouble(permitbuild) + Convert.ToDouble(inout) + Convert.ToDouble(locA) + Convert.ToDouble(elv) + Convert.ToDouble(floarloc) + Convert.ToDouble(sl) + Convert.ToDouble(lands) + Convert.ToDouble(qual) + Convert.ToDouble(heal) + Convert.ToDouble(mat) + Convert.ToDouble(reb);
                x = Convert.ToDouble(x) * Convert.ToDouble(pr);


                return Convert.ToDouble(x);
            }
        }

        // POST api/values
        public void Post([FromBody] string value)
        {
        }

        // PUT api/values/5
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/values/5
        public void Delete(int id)
        {
        }
    }
}
